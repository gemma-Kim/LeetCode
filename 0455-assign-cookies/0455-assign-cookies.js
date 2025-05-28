/**
 * @param {number[]} g /* cookies
 * @param {number[]} s
 * @return {number}
 */
var findContentChildren = function(g, s) {
    // let satisfiedCnt = 0;
    g.sort((a,b) => a-b);
    s.sort((a,b) => a-b);
    let children = 0;
    let cookie = 0;
    while (children < g.length && cookie < s.length) {
        if (s[cookie] >= g[children]) {
            // satisfiedCnt++;
            children++;
        }
        cookie++;
    }
    return children;

    // g.sort((a, b) => a - b); // 자식 만족도
    // s.sort((a, b) => a - b); // 쿠키 크기

    // let child = 0;
    // let cookie = 0;

    // while (child < g.length && cookie < s.length) {
    //     if (s[cookie] >= g[child]) {
    //         child++; // 이 자식은 만족함
    //     }
    //     cookie++; // 쿠키는 소모됨
    // }

    // return child; // 만족한 자식 수
};