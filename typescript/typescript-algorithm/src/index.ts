import fs from "fs";

const input = fs.readFileSync(0, "utf8").toString().trim().split("\n");

const num = input[1].trim();
let sum = 0;
for (let i = 0; i < num.length; i++) {
  sum += Number(num[i]);
}

console.log(sum);
