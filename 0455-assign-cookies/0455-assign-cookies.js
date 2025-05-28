/**
 * @param {number[]} g /* cookies
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    g.sort((a,b) => a-b);
    s.sort((a,b) => a-b);
    let children = 0;
    let cookie = 0;
    while (children < g.length && cookie < s.length) {
        if (s[cookie] >= g[children]) {
            children++;
        }
        cookie++;
    }
    return children;
};