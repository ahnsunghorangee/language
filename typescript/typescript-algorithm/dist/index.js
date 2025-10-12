"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
var fs_1 = __importDefault(require("fs"));
var input = fs_1.default.readFileSync(0, "utf8").toString().trim().split("\n");
var num = input[1].trim();
var sum = 0;
for (var i = 0; i < num.length; i++) {
    sum += Number(num[i]);
}
console.log(sum);
