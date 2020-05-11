function balancedParentheses(str) {
    let stack = [];
    let map = {
        '{' :'}',
        '[' : ']',
        '(' :')'
    }

    for(let i =0;i <str.length;i++){
        if(str[i] === '{'|| str[i] === '[' || str[i] === '(') {
            stack.push(str[i]);
        } else{
            var lastElem = stack.pop();
            if(str[i] !== map(lastElem)) {return false};
        }
    }

    if(stack.length !== 0) {return false};

    return true;
}

console.log(balancedParentheses("{[]()}" ));
console.log(balancedParentheses("{[(])}"));
console.log(balancedParentheses("{[}"));