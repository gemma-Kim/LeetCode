/**
 * @param {number[]} g /* cookies
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    // g.sort();
    // s.sort();
    // const minLen = Math.min(g.length, s.length)
    let satisfiedCnt = 0;
    g.sort((a,b) => a-b); // 자식
    s.sort((a,b) => a-b); // 쿠키
    // console.log('g2: ', g2)
    // console.log('s2: ', s2)
    while (s.length) {
        if (s[0] >= g[0]) {
            satisfiedCnt++;    
            g.shift();
        } 
        s.shift();
    }
    return satisfiedCnt;
};