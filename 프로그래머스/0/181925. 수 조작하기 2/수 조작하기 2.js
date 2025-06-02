function solution(numLog) {
  var answer = '';

  for(let i = 0; i<numLog.length; i++){
    const increment = numLog[i+1] - numLog[i]
    if(increment === 1){
      answer += 'w'
    }else if(increment === -1){
      answer += 's'
    }else if(increment === 10){
      answer += 'd'
    }else if(increment === -10 ){
      answer += 'a'
    }
  }

  return answer;
}