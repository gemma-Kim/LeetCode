class MinStack {
    arr: number[] = []
    minArr: number[] = []

    constructor() {
        
    }

    push(val: number): void {
        this.arr.push(val);
        if (!this.minArr.length || this.minArr[this.minArr.length-1] >= val) this.minArr.push(val);
    }

    pop(): void {
        const val = this.arr.pop();
        if (val == this.minArr[this.minArr.length-1]) this.minArr.pop();
    }

    top(): number {
        return this.arr[this.arr.length-1];   
    }

    getMin(): number {
        return this.minArr[this.minArr.length-1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */