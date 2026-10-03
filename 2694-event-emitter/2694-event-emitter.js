class EventEmitter {
    constructor() {
        this.events = {};
    }

    subscribe(event, cb) {
        if (!this.events[event]) {
            this.events[event] = [];
        }

        this.events[event].push(cb);

        return {
            unsubscribe: () => {
                this.events[event] = this.events[event].filter(
                    callback => callback !== cb
                );
            }
        };
    }

    emit(event, args = []) {
        if (!this.events[event]) {
            return [];
        }

        return this.events[event].map(callback => callback(...args));
    }
}