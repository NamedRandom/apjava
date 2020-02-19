import java.util.*;

public class MessageCipher {
  private String[][] letterBlock;
  private int numRows;
  private int numCols;

  public MessageCipher(int row, int col) {
    numRows = row;
    numCols = col;
    letterBlock = new String[row][col];
  }

  public MessageCipher fillBlock(String str) {
      int strLength = str.length();
      if(strLength<numRows*numCols)
          for(int i=0;i<((numRows*numCols)-strLength)%(numRows*numCols);i++)
              str+="A";
    int rowIndex = 0;
    int colIndex = 0;
    int readIndex = 0;
    while (rowIndex < numRows) {
      letterBlock[rowIndex][colIndex++] = Character.toString(str.charAt(readIndex++));
      if (colIndex == letterBlock[0].length) {
        colIndex = 0;
        rowIndex++;
      }
    }
    return this;
  }

  public void printTable() {
    System.out.println(this);
  }

  public String[][] getTable() {
      return letterBlock;
  }

  public String encryptBlock() {
    String out = "";
    int rowIndex = 0;
    int colIndex = 0;
    int readIndex = 0;
    while (colIndex<numCols) {
      out+=letterBlock[rowIndex++][colIndex];
      if (rowIndex == letterBlock.length) {
        rowIndex = 0;
        colIndex++;
      }
    }
    return out;
  }

  public String encryptMessage(String message) {
    String out = "";
    //MessageCipher[] messages = new MessageCipher[message.length()/(numRows*numCols)+1];
    for(int i=0;i<message.length()/(numRows*numCols);i++)
        out+= (new MessageCipher(numRows,numCols)).fillBlock(message.substring(i*numRows*numCols,i*numRows*numCols+numRows*numCols)).encryptBlock();
    out+= (new MessageCipher(numRows,numCols)).fillBlock(message.substring((message.length()/(numRows*numCols))*numRows*numCols)).encryptBlock();
    return out;
  }

  public String toString() {
    String s = new String();
    for (int i = 0; i < letterBlock.length; i++) {
      for (int j = 0; j < letterBlock[0].length; j++) s += letterBlock[i][j] + " ";
      s += "\n";
    }

    return s;
  }
}
