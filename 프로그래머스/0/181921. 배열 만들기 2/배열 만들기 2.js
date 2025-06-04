function solution(l, r) {
  var answer = [];

  for(let i = l; i<=r; i++){
    const numStr = i.toString();
    let isOnly = true;

    if([...numStr].every(digit => digit === '0' || digit === '5')){
      answer.push(i);
    }
  }

  return answer.length > 0 ? answer : [-1];
}