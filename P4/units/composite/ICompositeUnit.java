package units.composite;

import units.IPhysicalUnit;

public interface ICompositeUnit extends IPhysicalUnit{
	Operator getOperator();
	IPhysicalUnit getLeftUnit(); 
	IPhysicalUnit getRightUnit();

}
