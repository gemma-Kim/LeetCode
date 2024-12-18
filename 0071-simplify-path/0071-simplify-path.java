class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        String[] pathList = path.split("/+");
        for (int i = 0; i < pathList.length; i++) {
            if (pathList[i].equals("")) continue;
            // case1. . does not exist
            if (pathList[i].indexOf(".") == -1) {
                stack.push(pathList[i]);
            // case2. . does exist
            } else {
                if (pathList[i].equals("..")) {
                    if (!stack.isEmpty()) stack.pop();
                } else if (pathList[i].equals(".")) {
                } else {
                    stack.push(pathList[i]);
                }
            }
        }
        return "/" + String.join("/", stack);
    }
}