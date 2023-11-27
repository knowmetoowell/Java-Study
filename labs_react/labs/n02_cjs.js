const cjs01 = require('#labs/cjs/cjs01.js'); // 값
const cjs02 = require('#labs/cjs/cjs02.js'); // 함수
const cjs03 = require('#labs/cjs/cjs03.js'); // 객체

console.log(cjs01);
cjs02();
cjs03.fnA();

console.log(' === === === === === === ===');

// named
const mA = require('#labs/cjs/cjs04.js');
console.log(mA.a);
mA.fnA();

const { a, fnA } = require('#labs/cjs/cjs04.js');
console.log(a);
fnA();
console.log(' === === === === === === ===');

const { m_a, m_fnA } = require('#labs/cjs/cjs05.js');
console.log(m_a);
m_fnA();
console.log(' === === === === === === ===');

if (m_a > 0) {
  const a2 = require('#labs/cjs/cjs01.js'); // 값
  console.log(a2);
}
