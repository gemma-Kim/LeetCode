function simplifyPath(path: string): string {

    const pathList = path.split(/\/+/).filter(i => i).filter(i => i != ".");
    let stack = [];
    for (let p of pathList) {
        if (p === "..") {
            stack.pop()
        } else {
            stack.push(p)
        }
    }
    return "/" + stack.join("/")
};