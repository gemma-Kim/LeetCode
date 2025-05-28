/**
 * @param {number[]} g /* cookies
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    let satisfiedCnt = 0;
    g.sort((a,b) => a-b); // 자식
    s.sort((a,b) => a-b); // 쿠키
    while (s.length) {
        if (s[0] >= g[0]) {
            satisfiedCnt++;    
            g.shift();
        }
        s.shift();
    }
    return satisfiedCnt;
};