function main() {
  const data = getData();
  const n = data[0][0];
  const x = data[0][1];
  const numArr = [];
  for(let i =0 ; i<n; i++){
    if(data[1][i] < x){
      numArr.push(data[1][i]);
    }
  }
  const strResult = numArr.join(' ');
  console.log(strResult);
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