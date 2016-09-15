var characters = [
                 ["!","1","q","a","z"],
                 ["@","2","w","s","x"],
                 ["#","3","e","d","c"],
                 ["$","4","r","f","v"],
                 ["%","5","t","g","b"],
                 ["^","6","y","h","n"],
                 ["&","7","u","j","m"],
                 ["*","8","i","k"],
                 ["(","9","o","l"],
                 [")","0","p"]
];

while(title.length < 12){ title += title; }                                     // Makes the title at least 12 characters
var titlecharacters = title.split("");                                          // Separate every character into an array
var password = "";
var position, length, i;
for(p = 0; p < 12; p++){
    position = findcharacterpositon(titlecharacters[p]);                        // Find the position of a character in characters[]
    if(p > 5){
        i = p - 6;
    } else {
        i = p;
    }
    switch(i){
        case 0:
            position[1] += 1;                                                   // Change the positon to get the character that's one down
                                                                                // If there is a character down the list then choose that
                                                                                // Else choose the first character
            if(position[1] != characters[position[0]].length){
                password += characters[position[0]][position[1]];
            } else {
                password += characters[position[0]][3];
            }
            break;
        case 1:
            password += characters[position[0]][1];                             // Gets the number for the column
            break;
        case 2:
            password += characters[position[0]][0];                             // Gets the symbol for the column
            break;
        case 3:
            position[1] -= 1;                                                   // Change the position to get the characters that's one up
            length = characters[position[0]].length-1;                          // Finds length of the column
                                                                                // If the position is not a number or letter then use that
                                                                                // Else use the last character in the row
            if(position[1] >= 2){
                password += characters[position[0]][position[1]].toUpperCase();
            } else {
                password += characters[position[0]][length].toUpperCase();
            }
            break;
        case 4:
            position[0] -= 1;                                                   // Go to the row to the left
                                                                                // If the row to the left doesn't exist, use the last row
                                                                                // Else use the row to the left
            if(position[0] < 0){
                password += characters[9][1];
            } else {
                password += characters[position[0]][1];
            }
            break;
        case 5:
            position[0] += 1;                                                   // Go to the row to the right
                                                                                // If the row to the right doesn't exist, use the first row
                                                                                // Else use the row to the right
            if(position[0] > 9){
                password += characters[0][0];
            } else {
                password += characters[position[0]][0];
            }
            break;
    }
}
setClip(password);                                                              // Sets the password to the clipboard

function findcharacterpositon(character){
    var found;
                                                                                // Check each column for the character and set the position as an array[row, column]
    for(n = 0; n < 10; n++){
        for(k = 2; k < characters[n].length; k++){
            if(characters[n][k] == character){ found = [n,k]; }
        }
    }
    return found;
}
