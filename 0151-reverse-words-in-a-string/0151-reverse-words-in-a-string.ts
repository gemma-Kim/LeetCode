function reverseWords(s: string): string {
    s.trim()
    if (s == "") return ""
    const words = s.split(/\s+/);
    let results = "";
    for (let i = words.length-1; i >= 0; i--) {
        results += words[i] + " "
    }
    return results.trim()
};