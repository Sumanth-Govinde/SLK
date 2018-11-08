package oops;

public interface ITax {
	double HraExmpt(double dblBasic);
	double InsuranceExmpt(double dblBasic);
	double TravelExmpt(double dblBasic);
}
