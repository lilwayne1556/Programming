#!/usr/bin/env node

var Blynk = require('blynk-library');

var AUTH = '9e6252b3992c47288c0aca515f4f9ce5';

var blynk = new Blynk.Blynk(AUTH, options={addr:"192.168.1.111", port:8441});

var v1 = new blynk.VirtualPin(1);


WidgetLED led1(v1);
led1.off();
led1.on();
