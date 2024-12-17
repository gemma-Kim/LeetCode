function isHappy(n: number): boolean {
    const set = new Set<number>();
    while (n != 1) {
        let sum = 0
        let current = n;
        while (current > 0) {
            const digit = current % 10
            sum += digit * digit
            current = Math.floor(current / 10);
        }
        if (set.has(sum)) return false
        set.add(sum)
        n = sum
    }
    return true;
};