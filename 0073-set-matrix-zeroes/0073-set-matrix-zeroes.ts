/**
 Do not return anything, modify matrix in-place instead.
 */
function setZeroes(matrix: number[][]): void {
    const checkerM = new Map();
    for (let r = 0; r < matrix.length; r++) {
        for (let c = 0; c < matrix[0].length; c++) {
            if (matrix[r][c] === 0) {
                if (!checkerM.get('row' + r)) checkerM.set('row' + r, true);
                if (!checkerM.get('cloumn' + c)) checkerM.set('cloumn' + c, true);
            }
        }
    }

    for (let r = 0; r < matrix.length; r++) {
        for (let c = 0; c < matrix[0].length; c++) {
            if (matrix[r][c] !== 0) {
                if (checkerM.get('row' + r) || checkerM.get('cloumn' + c)) {
                    matrix[r][c] = 0;
                }
            }
        }
    }
};
