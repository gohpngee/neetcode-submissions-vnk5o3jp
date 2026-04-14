class Solution {
    /**
     * @param {string[]} operations
     * @return {number}
     */
    calPoints(operations) {
        const stack = [];
        for (let ops of operations) {
            if (ops === "+") {
                const last = stack[stack.length - 1];
                const secondLast = stack[stack.length -2];
                stack.push(last + secondLast);
                console.log(stack);
            }
            else if (ops === "D") {
                const last = stack[stack.length -1];
                stack.push(2 * last);
            }
            else if (ops === "C") {
                stack.pop();
            }
            else {
                stack.push(Number(ops));
            }
        }
        return stack.reduce((acc, val) => acc+=val, 0)
    }
}
