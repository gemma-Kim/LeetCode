/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    const map = new Map();
    let total = 0;
    let hasOddNum = false;
    for (let i = 0; i < s.length; i++) {
        const keyCnt = map.get(s[i]);
        if (keyCnt == undefined) {
            map.set(s[i], 1);
        } else if (keyCnt > 0) {
            map.set(s[i], keyCnt+1);
        }
    }
    for (const [key, cnt] of map) {
        if (cnt % 2 === 0) {
            total += cnt;
        } else {        
            hasOddNum = true;
            total += cnt - 1;
        }
    }
    return hasOddNum ? total + 1 : total;
};