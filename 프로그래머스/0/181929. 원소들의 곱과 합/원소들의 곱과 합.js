function solution(num_list) {
  var answer = 0;
  let sum = 0;
  let mul = 1

  for(let i = 0; i<num_list.length; i++){
    sum += num_list[i];
    mul *= num_list[i];
  }

  answer = mul < sum**2 ? 1 : 0;

  return answer;
}