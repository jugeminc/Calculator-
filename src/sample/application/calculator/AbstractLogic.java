package sample.application.calculator;

import sample.application.calculator.CalculatorActivity;
import sample.application.calculator.FunctionLogic;


public abstract class AbstractLogic implements FunctionLogic {

	@Override
	public void doFunction(CalculatorActivity ca) {
		// TODO 自動生成されたメソッド・スタブ
		//this.beforeDoSomething(ca);
		this.doSomething(ca);
		ca.showNumber(ca.strTemp);
		//this.afterDoSomething3(ca);
	}
	
	//public abstract void beforeDoSomething(CalculatorActivity ca);
	public abstract void doSomething(CalculatorActivity ca);
	//public abstract void afterDoSomething3(CalculatorActivity ca);

}
