package sample.application.calculator;

public class Bs implements FunctionLogic {

	@Override
	public void doFunction(CalculatorActivity ca) {
		if(ca.strTemp.length() == 0){
			return;
		}else{
			ca.strTemp = ca.strTemp.substring(0,ca.strTemp.length()-1);
		}
		
	}

}
