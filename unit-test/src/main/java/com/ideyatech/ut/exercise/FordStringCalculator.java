package com.ideyatech.ut.exercise;

public class FordStringCalculator {
	
	public FordStringCalculator(){
		
	}
	
	public long calculate(String input){
		
		//If input is plain number
		if(input.matches("[0-9]+") || input.matches("(.*)-(.*)")){
			if(input.equals("") || input.equals(null)){
				return 0;
			}else if(input.length() == 1){
				return Long.parseLong(input);
			}else if(Long.parseLong(input) > 1000){
				return 0;
			}else if(Long.parseLong(input) < 0){
				throw new IllegalArgumentException();
			}else{
				return 0;
			}
		}else{
			//If input is delimited
			if(input.indexOf(",") > -1){
				int i = input.split(",").length;
				long total = 0;
				for(int x = 0; x < i; x++){
					if(Long.parseLong(input.split(",")[x]) < 1000 && Long.parseLong(input.split(",")[x]) > 0)
						total += Long.parseLong(input.split(",")[x]);
					else if(Long.parseLong(input.substring(3).split(input.substring(2, 3))[x]) < 0)
						throw new IllegalArgumentException();
				}
				return total;
			}else if(input.contains("//") && !(input.contains("["))){
				int i = input.substring(3).split(input.substring(2, 3)).length;
				long total = 0;
				for(int x = 0; x < i; x++){
					if(Long.parseLong(input.substring(3).split(input.substring(2, 3))[x]) < 1000)
						total += Long.parseLong(input.substring(3).split(input.substring(2, 3))[x]);
					else if(Long.parseLong(input.substring(3).split(input.substring(2, 3))[x]) < 0)
						throw new IllegalArgumentException();
				}
				return total;
			}else if(input.contains("//[")){
				
				//Seek closing bracket
				int endBracket = input.indexOf("]");
				int i = input.substring(endBracket+1).split(input.substring(3, endBracket)).length;
				long total = 0;
				for(int x = 0; x < i; x++){
					if(Long.parseLong(input.substring(endBracket+1).split(input.substring(3, endBracket))[x]) < 1000 && Long.parseLong(input.substring(endBracket+1).split(input.substring(3, endBracket))[x]) > 0)
						total += Long.parseLong(input.substring(endBracket+1).split(input.substring(3, endBracket))[x]);
					else if(Long.parseLong(input.substring(3).split(input.substring(2, 3))[x]) < 0)
						throw new IllegalArgumentException();
				}
				return total;
			}else{
				return 0;
			}
		}
			
		
	}

}
