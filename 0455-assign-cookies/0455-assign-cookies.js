/**
 * @param {number[]} g /* cookies
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    g.sort();
    s.sort();
    // const minLen = Math.min(g.length, s.length)
    let satisfiedCnt = 0;
    let g2 = g.sort((a,b) => a-b); // 자식
    let s2 = s.sort((a,b) => a-b); // 쿠키
    // console.log('g2: ', g2)
    // console.log('s2: ', s2)
    while (s2.length) {
        if (s2[0] >= g2[0]) {
            satisfiedCnt++;
            // console.log('g2: ', g2)
            // console.log('s2: ', s2)
            s2.shift();
            g2.shift();
        } else {
            s2.shift();
        }
    }
    return satisfiedCnt;
};