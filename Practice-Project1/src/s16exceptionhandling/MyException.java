package s16exceptionhandling;

	
	class MyException extends Exception{
		   /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String str1;
		   MyException(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("MyException Occurred: "+str1) ;
		   }
		}
