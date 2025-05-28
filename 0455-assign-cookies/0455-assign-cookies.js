/**
 * @param {number[]} g /* cookies
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    let satisfiedCnt = 0;
    g.sort((a,b) => a-b);
    s.sort((a,b) => a-b);
    while (s.length) {
        if (s[0] >= g[0]) {
            satisfiedCnt++;    
            g = g.slice(1);
        }
        s = s.slice(1);
    }
    return satisfiedCnt;
};