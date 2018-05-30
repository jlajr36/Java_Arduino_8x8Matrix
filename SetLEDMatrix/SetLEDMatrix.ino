#include "LedControl.h"

String inBuffer; //Hold Serial in Data;
String parts[3]; //Hold Row-Col-T/F

int lastIndex = 0;
int counter = 0;

int row = 0;
int col = 0;
bool state = false;

LedControl lc = LedControl(12,11,10,1);

void setup() {
  Serial.begin(9600); //Start Serial
  lc.shutdown(0,false); //wake up led control
  lc.setIntensity(0,8); //Set Brightness
  lc.clearDisplay(0); //Clear display
}

void loop() {
  while(Serial.available() > 0) {
    char _char = Serial.read(); //Get one Char
    inBuffer += _char;          //Add char to buffer
    if(_char == '\n') {      //If Get Line Char
      for(int i = 0; i < inBuffer.length(); i++) { //Each char of string
        if(inBuffer.substring(i, i+1) == ",") { //look for comma
          parts[counter] = inBuffer.substring(lastIndex, i);
          lastIndex = i + 1;
          counter++;
        }
        if(i == inBuffer.length() - 1) {
          parts[counter] = inBuffer.substring(lastIndex, i);
        }
      }
      //Send data back for loop back test
      Serial.println(parts[0] + "," + parts[1] + "," + parts[2]);
      row = parts[0].toInt();
      col = parts[1].toInt();
      if (parts[2] == "t") {
        state = true;
      } else {
        state = false;
      }
      lc.setLed(0, row, col, state); //set led      
      inBuffer = "";            //clear Buffer for next time
      counter = 0;
      lastIndex = 0;
    }
  }
}
