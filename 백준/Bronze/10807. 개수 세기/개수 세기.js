function main() {
  const data = getData();
  const n = data[0];
  const rowArr = data[1];
  const v = data[2];

  let sum = 0;
  if(n === 1 && rowArr === v){
    sum += 1;
  }else{
    for(let i = 0; i<rowArr.length; i++){
      if(v === rowArr[i]){
        sum += 1;
      }
    }
  }
  console.log(sum);
}

function getData() {
  const arr = require("fs").readFileSync(0).toString().trim().split("\n");
  const result = [];
  for (let row of arr) {
    const rowArr = row.split(' ');
    for (let k=0; k<rowArr.length; k++) rowArr[k] = isNaN(rowArr[k]) ? rowArr[k] : parseInt(rowArr[k]);
    result.push(rowArr.length === 1 ? rowArr[0] : rowArr);
  }
  return result.length===1 ? result[0] : result;
}

main();