function toUnicode(theString) {
  var unicodeString = '';
  for (var i=0; i < theString.length; i++) {
    var theUnicode = theString.charCodeAt(i).toString(16).toUpperCase();
    while (theUnicode.length < 4) {
      theUnicode = '0' + theUnicode;
    }
    theUnicode = '\\u' + theUnicode;
    unicodeString += theUnicode;
  }
  return unicodeString;
}

var noLetters = /([A-Z])\w+/gi;
var noNumbers = /([0-9])\w+/gi;
test = test.replace(noLetters, "");
test = test.replace(noNumbers, "");
var unicode = toUnicode(test);
var emojiIndex = unicode.search("");
flash(unicode);
