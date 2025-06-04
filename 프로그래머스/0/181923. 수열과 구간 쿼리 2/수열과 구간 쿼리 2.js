function solution(arr, queries) {
  var answer = [];

  for(let query of queries){
    const [s, e, k] = query
    let min = 1000000;
    for (let i=s; i<=e; i++){
      if(arr[i]>k && arr[i]<min){
        min = arr[i];
      }
    }
    answer.push(min === 1000000 ? -1 : min)
  }

  return answer;
}
