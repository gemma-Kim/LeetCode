function longestPalindrome(s: string): string {
    if (s.length < 2) return s;
    let min = 0, max = 1;
    const expand = (left, right) => {
        while (left >=0 && right <= s.length-1 && s[left] === s[right]) {
            if (right - left + 1 > max - min) {
                max = right + 1;
                min = left;
            }
            left--;
            right++;
        }
    }
    
    for (let i = 0; i < s.length; i++) {
        expand(i, i);
        expand(i, i + 1);
    }

    return s.slice(min, max)
};