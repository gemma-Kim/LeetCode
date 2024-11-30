function groupAnagrams(strs: string[]): string[][] {
    const map = new Map()
    for (const str of strs) {
        const sortedChar = str.split("").sort().join("")
        if (map.has(sortedChar)) {
            map.get(sortedChar).push(str);
        } else {
            map.set(sortedChar, [str])
        }
    }
    const result = [];
    for (const value of map.values()) {
        result.push(value)
    }
    return result
};