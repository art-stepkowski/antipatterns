private boolean isHappyAntipatternVersion(boolean expression1, boolean expression2) {
  if(expression1){
    if(expression2) {
      return true;
    }
    else {
      return false; 
    }
  }
  else
  {
    return false;
  }
}

private boolean isHappyRightVersion(boolean expression1, boolean expression2) {
  return expression1 && expression2;
}