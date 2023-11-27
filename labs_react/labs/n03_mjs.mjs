import a1 from '#labs/esm/esm01.mjs';
import a2 from '#labs/esm/esm02.mjs';
import a3 from '#labs/esm/esm03.mjs';

console.log(a1);

a2();

console.log(a3.a);
a3.fnA();

console.log('==========================');

import * as mA from '#labs/esm/esm04.mjs';
console.log(mA.a);
mA.fnA();

import { a, fnA } from '#labs/esm/esm04.mjs';
console.log(a);
fnA();

import { a as a11, fnA as fnA1 } from '#labs/esm/esm04.mjs';
console.log(a11);
fnA1();

console.log('==========================');

import { m_a, m_fnA, m_a2 } from '#labs/esm/esm05.mjs';
console.log(m_a);
m_fnA();
console.log(m_a2);

import * as mB from '#labs/esm/esm05.mjs';
console.log(mB.m_a);
mB.m_fnA();
