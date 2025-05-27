function solution(ineq, eq, n, m) {
  var answer = 0;

  if(ineq === '>' && eq === '='){ // n >= m
    if(n >= m) answer = 1;
  }else if(ineq === '<' && eq === '='){ // n <= m
    if(n <= m) answer = 1;
  }else if(ineq === '>' && eq === '!'){ // n > m
    if(n > m) answer = 1;
  }else if(ineq === '<' && eq === '!'){ // n < m
    if(n < m) answer = 1;
  }
  
  return answer;
}