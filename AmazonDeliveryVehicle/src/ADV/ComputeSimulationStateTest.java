package ADV;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputeSimulationStateTest {

	private void clearAlerts (Alerts alerts) {
    	alerts.setESR(false);
    	alerts.setPWR60(false);
    	alerts.setISRZ(false);
    	alerts.setDC(false);
    	alerts.setPD(false);
    	alerts.setPOS(false);
    	alerts.setPackage_not_delivered(false);
    	alerts.setPDMG(false);
	}
 
	@Test
	public void testCompute_state1() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(253.1);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(101.805);
		measurements.setVd(-6.787);
		measurements.setpower_remaining(182);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(8);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(false,alerts.isPWR60());
		assertEquals(true,alerts.isPOS());
		assertEquals(false,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(249.9,measurements.getAltitude(),0.01);
		assertEquals(100.005,measurements.getVf(),0.0001);
		assertEquals(-6.667,measurements.getVd(),0.0001);
		assertEquals("MP1",measurements.getMotor_state());
		assertEquals(180,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state2() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(253.1);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(101.805);
		measurements.setVd(-6.787);
		measurements.setpower_remaining(182);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(10);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(false,alerts.isPWR60());
		assertEquals(true,alerts.isPOS());
		assertEquals(true,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(249.9,measurements.getAltitude(),0.01);
		assertEquals(100.005,measurements.getVf(),0.0001);
		assertEquals(-6.667,measurements.getVd(),0.0001);
		assertEquals("MP1",measurements.getMotor_state());
		assertEquals(180,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state3() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(253.1);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(101.790);
		measurements.setVd(-6.786);
		measurements.setpower_remaining(182);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(8);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(false,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(false,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(249.9,measurements.getAltitude(),0.01);
		assertEquals(99.990,measurements.getVf(),0.0001);
		assertEquals(-6.666,measurements.getVd(),0.0001);
		assertEquals("MP1",measurements.getMotor_state());
		assertEquals(180,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state4() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(53.1);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(101.790);
		measurements.setVd(-6.786);
		measurements.setpower_remaining(182);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(8);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(false,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(false,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(49.9,measurements.getAltitude(),0.01);
		assertEquals(99.990,measurements.getVf(),0.0001);
		assertEquals(-6.666,measurements.getVd(),0.0001);
		assertEquals("MP1",measurements.getMotor_state());
		assertEquals(180,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state5() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(1.5);
		measurements.setshield_position("D");
		measurements.setshield_cmd("D");
		measurements.setVf(26.460);
		measurements.setVd(-1.764);
		measurements.setpower_remaining(180);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(8);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(false,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(0.1,measurements.getAltitude(),0.01);
		assertEquals(25.005,measurements.getVf(),0.0001);
		assertEquals(-1.6670,measurements.getVd(),0.0001);
		assertEquals("MP2",measurements.getMotor_state());
		assertEquals(179,measurements.getpower_remaining(),.1);
		assertEquals("D",measurements.getshield_position());
		assertEquals("D",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state7() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(15.4);
		measurements.setshield_position("D");
		measurements.setshield_cmd("D");
		measurements.setVf(16.44);
		measurements.setVd(-1.096);
		measurements.setpower_remaining(166);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(8);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(false,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(true,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(14.0,measurements.getAltitude(),0.01);
		assertEquals(14.985,measurements.getVf(),0.0001);
		assertEquals(-0.999,measurements.getVd(),0.0001);
		assertEquals("MP2",measurements.getMotor_state());
		assertEquals(165,measurements.getpower_remaining(),.1);
		assertEquals("D",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state6() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 6 - Scenario 5a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(25.2);
		measurements.setshield_position("D");
		measurements.setshield_cmd("D");
		measurements.setVf(26.445);
		measurements.setVd(-1.76300);
		measurements.setpower_remaining(173);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(8);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(false,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(true,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(23.8,measurements.getAltitude(),0.01);
		assertEquals(24.990,measurements.getVf(),0.0001);
		assertEquals(-1.6660,measurements.getVd(),0.0001);
		assertEquals("MP2",measurements.getMotor_state());
		assertEquals(172,measurements.getpower_remaining(),.1);
		assertEquals("D",measurements.getshield_position());
		assertEquals("D",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state8() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 8 - Scenario 7a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(0.0);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(0.075);
		measurements.setVd(-0.00500);
		measurements.setpower_remaining(155);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(8);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(false,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(true,alerts.isPD());
		assertEquals(0.0,measurements.getAltitude(),0.01);
		assertEquals(0.075,measurements.getVf(),0.0001);
		assertEquals(-0.0050,measurements.getVd(),0.0001);
		assertEquals("Off",measurements.getMotor_state());
		assertEquals(155,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state9() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 9 - Scenario 7b test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(0.0);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(0.075);
		measurements.setVd(-0.00500);
		measurements.setpower_remaining(155);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(8);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(6);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(false,alerts.isPDMG());
		assertEquals(true,alerts.isPackage_not_delivered());
		assertEquals(true,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(0.0,measurements.getAltitude(),0.01);
		assertEquals(0.075,measurements.getVf(),0.0001);
		assertEquals(-0.0050,measurements.getVd(),0.0001);
		assertEquals("Off",measurements.getMotor_state());
		assertEquals(155,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state10() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 10 - Scenario 7c test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(0.0);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(0.075);
		measurements.setVd(-0.00500);
		measurements.setpower_remaining(155);
		alerts.setRand_value(0.29); //changed to alerts instead of measurements
		alerts.setshield_damage_count(11);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(1);	//change to 1 and it works
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(true,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(true,alerts.isPD());
		assertEquals(0.0,measurements.getAltitude(),0.01);
		assertEquals(0.075,measurements.getVf(),0.0001);
		assertEquals(-0.0050,measurements.getVd(),0.0001);
		assertEquals("Off",measurements.getMotor_state());
		assertEquals(155,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state11() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(0.0);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(0.075);
		measurements.setVd(-0.005);
		measurements.setpower_remaining(155);
		alerts.setRand_value(0.29); //changed to alerts instead of measurements
		alerts.setshield_damage_count(11);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(true,alerts.isPDMG());
		assertEquals(true,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(0.0,measurements.getAltitude(),0.01);
		assertEquals(0.075,measurements.getVf(),0.0001);
		assertEquals(-0.005,measurements.getVd(),0.0001);
		assertEquals("Off",measurements.getMotor_state());
		assertEquals(155,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state12() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(0.0);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(0.075);
		measurements.setVd(-0.005);
		measurements.setpower_remaining(155);
		alerts.setRand_value(0.29); //changed to alerts instead of measurements
		alerts.setshield_damage_count(11);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(6);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(true,alerts.isPDMG());
		assertEquals(true,alerts.isPackage_not_delivered());
		assertEquals(true,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(0.0,measurements.getAltitude(),0.01);
		assertEquals(0.075,measurements.getVf(),0.0001);
		assertEquals(-0.005,measurements.getVd(),0.0001);
		assertEquals("Off",measurements.getMotor_state());
		assertEquals(155,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state13() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(53.1);
		measurements.setshield_position("D");
		measurements.setshield_cmd("D");
		measurements.setVf(101.790);
		measurements.setVd(-6.786);
		measurements.setpower_remaining(182);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(8);
		alerts.setESR_latch(true);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(false,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(false,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(49.9,measurements.getAltitude(),0.01);
		assertEquals(99.990,measurements.getVf(),0.0001);
		assertEquals(-6.666,measurements.getVd(),0.0001);
		assertEquals("MP1",measurements.getMotor_state());
		assertEquals(180,measurements.getpower_remaining(),.1);
		assertEquals("D",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state14() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(253.1);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(101.790);
		measurements.setVd(-6.786);
		measurements.setpower_remaining(182);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(11);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(false,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(true,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(249.9,measurements.getAltitude(),0.01);
		assertEquals(99.990,measurements.getVf(),0.0001);
		assertEquals(-6.666,measurements.getVd(),0.0001);
		assertEquals("MP1",measurements.getMotor_state());
		assertEquals(180,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state15() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();
	
		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(53.1);
		measurements.setshield_position("R");
		measurements.setshield_cmd("R");
		measurements.setVf(101.790);
		measurements.setVd(-6.78600);
		measurements.setpower_remaining(182);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(11);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(false,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(true,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(49.9,measurements.getAltitude(),0.01);
		assertEquals(99.990,measurements.getVf(),0.0001);
		assertEquals(-6.666,measurements.getVd(),0.0001);
		assertEquals("MP1",measurements.getMotor_state());
		assertEquals(180,measurements.getpower_remaining(),.1);
		assertEquals("R",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state16() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();
	
		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(1.5);
		measurements.setshield_position("D");
		measurements.setshield_cmd("D");
		measurements.setVf(26.460);
		measurements.setVd(-1.76400);
		measurements.setpower_remaining(180);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(11);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(true,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(0.1,measurements.getAltitude(),0.01);
		assertEquals(25.005,measurements.getVf(),0.0001);
		assertEquals(-1.667,measurements.getVd(),0.0001);
		assertEquals("MP2",measurements.getMotor_state());
		assertEquals(179,measurements.getpower_remaining(),.1);
		assertEquals("D",measurements.getshield_position());
		assertEquals("D",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state17() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(25.2);
		measurements.setshield_position("D");
		measurements.setshield_cmd("D");
		measurements.setVf(26.445);
		measurements.setVd(-1.76300);
		measurements.setpower_remaining(173);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(11);
		alerts.setESR_latch(false);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(true,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(false,alerts.isESR());
		assertEquals(true,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(23.8,measurements.getAltitude(),0.01);
		assertEquals(24.990,measurements.getVf(),0.0001);
		assertEquals(-1.666,measurements.getVd(),0.0001);
		assertEquals("MP2",measurements.getMotor_state());
		assertEquals(172,measurements.getpower_remaining(),.1);
		assertEquals("D",measurements.getshield_position());
		assertEquals("D",measurements.getshield_cmd());
	}
	
	@Test
	public void testCompute_state18() {
		Alerts alerts = new Alerts();
		Measurements measurements = new Measurements();
		ComputeSimulationState state = new ComputeSimulationState();

		//test case 1 - Scenario 1a test alt BV of 249.9
		clearAlerts(alerts);
		measurements.setAltitude(15.4);
		measurements.setshield_position("D");
		measurements.setshield_cmd("D");
		measurements.setVf(16.44);
		measurements.setVd(-1.096);
		measurements.setpower_remaining(166);
		alerts.setRand_value(0.59); //changed to alerts instead of measurements
		alerts.setshield_damage_count(11);
		alerts.setESR_latch(true);
		alerts.setEsr_persistence_count(0);
		measurements.setCum_attitude(5);
		measurements.setTerr_attitude(-1);
		state.compute_state(measurements, alerts, 1);
		assertEquals(true,alerts.isPWR60());
		assertEquals(false,alerts.isPOS());
		assertEquals(true,alerts.isPDMG());
		assertEquals(false,alerts.isPackage_not_delivered());
		assertEquals(false,alerts.isDC());
		assertEquals(true,alerts.isESR());
		assertEquals(false,alerts.isISRZ());
		assertEquals(false,alerts.isPD());
		assertEquals(14.0,measurements.getAltitude(),0.01);
		assertEquals(14.985,measurements.getVf(),0.0001);
		assertEquals(-0.999,measurements.getVd(),0.0001);
		assertEquals("MP2",measurements.getMotor_state());
		assertEquals(165,measurements.getpower_remaining(),.1);
		assertEquals("D",measurements.getshield_position());
		assertEquals("R",measurements.getshield_cmd());
	}
	

@Test
public void testCompute_state19() {
	Alerts alerts = new Alerts();
	Measurements measurements = new Measurements();
	ComputeSimulationState state = new ComputeSimulationState();
clearAlerts(alerts);
measurements.setAltitude(0.0);
measurements.setshield_position("R");
measurements.setshield_cmd("R");
measurements.setVf(148.200);
measurements.setVd(-9.880);
measurements.setpower_remaining(298);
alerts.setRand_value(-0.1);
alerts.setshield_damage_count(11); 
alerts.setESR_latch(false);
alerts.setEsr_persistence_count(0);
measurements.setCum_attitude(0);
measurements.setTerr_attitude(-6);
state.compute_state(measurements, alerts, 1);
assertEquals(false,alerts.isPWR60()); 
assertEquals(true,alerts.isPOS());
assertEquals(true,alerts.isPDMG());
assertEquals(true,alerts.isPackage_not_delivered());
assertEquals(true,alerts.isDC());
assertEquals(false,alerts.isESR());
assertEquals(false,alerts.isISRZ());
assertEquals(false,alerts.isPD());
assertEquals(0.0,measurements.getAltitude(),0.01);
assertEquals(148.20,measurements.getVf(),0.001);
assertEquals(-9.880,measurements.getVd(),0.001);
assertEquals("Off",measurements.getMotor_state());
assertEquals(298,measurements.getpower_remaining(),1);
assertEquals("R",measurements.getshield_position());
assertEquals("R",measurements.getshield_cmd());
}

@Test
public void testCompute_state20() {
    Alerts alerts = new Alerts();
    Measurements measurements = new Measurements();
    ComputeSimulationState state = new ComputeSimulationState();
//test case 19 - Scenario test Attitude BV of cumatt 0 and terr -6
clearAlerts(alerts);
measurements.setAltitude(0.0);
measurements.setshield_position("D");
measurements.setshield_cmd("D");
measurements.setVf(148.200);
measurements.setVd(-9.880);
measurements.setpower_remaining(298);
alerts.setRand_value(0.59);
alerts.setshield_damage_count(8); 
alerts.setESR_latch(false);
alerts.setEsr_persistence_count(0);
measurements.setCum_attitude(0);
measurements.setTerr_attitude(-6);
state.compute_state(measurements, alerts, 1);
assertEquals(false,alerts.isPWR60()); 
assertEquals(false,alerts.isPOS());
assertEquals(false,alerts.isPDMG());
assertEquals(true,alerts.isPackage_not_delivered());
assertEquals(true,alerts.isDC());
assertEquals(false,alerts.isESR());
assertEquals(false,alerts.isISRZ());
assertEquals(false,alerts.isPD());
assertEquals(0.0,measurements.getAltitude(),0.01);
assertEquals(148.20,measurements.getVf(),0.001);
assertEquals(-9.880,measurements.getVd(),0.001);
assertEquals("Off",measurements.getMotor_state());
assertEquals(298,measurements.getpower_remaining(),1);
assertEquals("D",measurements.getshield_position());
assertEquals("D",measurements.getshield_cmd());
}

@Test
public void testCompute_state21() {
	Alerts alerts = new Alerts();
	Measurements measurements = new Measurements();
	ComputeSimulationState state = new ComputeSimulationState();

	//test case 8 - Scenario 7a test alt BV of 249.9
	clearAlerts(alerts);
	measurements.setAltitude(0.0);
	measurements.setshield_position("R");
	measurements.setshield_cmd("R");
	measurements.setVf(0.075);
	measurements.setVd(-0.00500);
	measurements.setpower_remaining(155);
	alerts.setRand_value(0.59); //changed to alerts instead of measurements
	alerts.setshield_damage_count(8);
	alerts.setESR_latch(false);
	alerts.setEsr_persistence_count(0);
	measurements.setCum_attitude(-1);
	measurements.setTerr_attitude(5);
	state.compute_state(measurements, alerts, 1);
	assertEquals(true,alerts.isPWR60());
	assertEquals(false,alerts.isPOS());
	assertEquals(false,alerts.isPDMG());
	assertEquals(false,alerts.isPackage_not_delivered());
	assertEquals(false,alerts.isDC());
	assertEquals(false,alerts.isESR());
	assertEquals(false,alerts.isISRZ());
	assertEquals(true,alerts.isPD());
	assertEquals(0.0,measurements.getAltitude(),0.01);
	assertEquals(0.075,measurements.getVf(),0.0001);
	assertEquals(-0.0050,measurements.getVd(),0.0001);
	assertEquals("Off",measurements.getMotor_state());
	assertEquals(155,measurements.getpower_remaining(),.1);
	assertEquals("R",measurements.getshield_position());
	assertEquals("R",measurements.getshield_cmd());
}

@Test
public void testCompute_state22() {
	Alerts alerts = new Alerts();
	Measurements measurements = new Measurements();
	ComputeSimulationState state = new ComputeSimulationState();

	//test case 9 - Scenario 7b test alt BV of 249.9
	clearAlerts(alerts);
	measurements.setAltitude(0.0);
	measurements.setshield_position("R");
	measurements.setshield_cmd("R");
	measurements.setVf(0.075);
	measurements.setVd(-0.00500);
	measurements.setpower_remaining(155);
	alerts.setRand_value(0.59); //changed to alerts instead of measurements
	alerts.setshield_damage_count(8);
	alerts.setESR_latch(false);
	alerts.setEsr_persistence_count(0);
	measurements.setCum_attitude(-1);
	measurements.setTerr_attitude(6);
	state.compute_state(measurements, alerts, 1);
	assertEquals(true,alerts.isPWR60());
	assertEquals(false,alerts.isPOS());
	assertEquals(false,alerts.isPDMG());
	assertEquals(true,alerts.isPackage_not_delivered());
	assertEquals(true,alerts.isDC());
	assertEquals(false,alerts.isESR());
	assertEquals(false,alerts.isISRZ());
	assertEquals(false,alerts.isPD());
	assertEquals(0.0,measurements.getAltitude(),0.01);
	assertEquals(0.075,measurements.getVf(),0.0001);
	assertEquals(-0.0050,measurements.getVd(),0.0001);
	assertEquals("Off",measurements.getMotor_state());
	assertEquals(155,measurements.getpower_remaining(),.1);
	assertEquals("R",measurements.getshield_position());
	assertEquals("R",measurements.getshield_cmd());
}

@Test
public void testCompute_state23() {
	Alerts alerts = new Alerts();
	Measurements measurements = new Measurements();
	ComputeSimulationState state = new ComputeSimulationState();

	//test case 1 - Scenario 1a test alt BV of 249.9
	clearAlerts(alerts);
	measurements.setAltitude(0.0);
	measurements.setshield_position("R");
	measurements.setshield_cmd("R");
	measurements.setVf(0.075);
	measurements.setVd(-0.005);
	measurements.setpower_remaining(155);
	alerts.setRand_value(0.59); //changed to alerts instead of measurements
	alerts.setshield_damage_count(11);
	alerts.setESR_latch(false);
	alerts.setEsr_persistence_count(0);
	measurements.setCum_attitude(5);
	measurements.setTerr_attitude(-1);
	state.compute_state(measurements, alerts, 1);
	assertEquals(true,alerts.isPWR60());
	assertEquals(false,alerts.isPOS());
	assertEquals(true,alerts.isPDMG());
	assertEquals(true,alerts.isPackage_not_delivered());
	assertEquals(true,alerts.isDC());
	assertEquals(false,alerts.isESR());
	assertEquals(false,alerts.isISRZ());
	assertEquals(false,alerts.isPD());
	assertEquals(0.0,measurements.getAltitude(),0.01);
	assertEquals(0.075,measurements.getVf(),0.0001);
	assertEquals(-0.005,measurements.getVd(),0.0001);
	assertEquals("Off",measurements.getMotor_state());
	assertEquals(155,measurements.getpower_remaining(),.1);
	assertEquals("R",measurements.getshield_position());
	assertEquals("R",measurements.getshield_cmd());
}
@Test
public void testCompute_state24() {
	Alerts alerts = new Alerts();
	Measurements measurements = new Measurements();
	ComputeSimulationState state = new ComputeSimulationState();

	//test case 1 - Scenario 1a test alt BV of 249.9
	clearAlerts(alerts);
	measurements.setAltitude(0.0);
	measurements.setshield_position("R");
	measurements.setshield_cmd("R");
	measurements.setVf(0.075);
	measurements.setVd(-0.005);
	measurements.setpower_remaining(155);
	alerts.setRand_value(0.59); //changed to alerts instead of measurements
	alerts.setshield_damage_count(11);
	alerts.setESR_latch(false);
	alerts.setEsr_persistence_count(0);
	measurements.setCum_attitude(6);
	measurements.setTerr_attitude(-1);
	state.compute_state(measurements, alerts, 1);
	assertEquals(true,alerts.isPWR60());
	assertEquals(false,alerts.isPOS());
	assertEquals(true,alerts.isPDMG());
	assertEquals(true,alerts.isPackage_not_delivered());
	assertEquals(true,alerts.isDC());
	assertEquals(false,alerts.isESR());
	assertEquals(false,alerts.isISRZ());
	assertEquals(false,alerts.isPD());
	assertEquals(0.0,measurements.getAltitude(),0.01);
	assertEquals(0.075,measurements.getVf(),0.0001);
	assertEquals(-0.005,measurements.getVd(),0.0001);
	assertEquals("Off",measurements.getMotor_state());
	assertEquals(155,measurements.getpower_remaining(),.1);
	assertEquals("R",measurements.getshield_position());
	assertEquals("R",measurements.getshield_cmd());
}
@Test
public void testCompute_state25() {
	Alerts alerts = new Alerts();
	Measurements measurements = new Measurements();
	ComputeSimulationState state = new ComputeSimulationState();

	//test case 1 - Scenario 1a test alt BV of 249.9
	clearAlerts(alerts);
	measurements.setAltitude(0.0);
	measurements.setshield_position("D");
	measurements.setshield_cmd("D");
	measurements.setVf(0.075);
	measurements.setVd(-0.005);
	measurements.setpower_remaining(155);
	alerts.setRand_value(0.59); //changed to alerts instead of measurements
	alerts.setshield_damage_count(8);
	alerts.setESR_latch(true);
	alerts.setEsr_persistence_count(0);
	measurements.setCum_attitude(6);
	measurements.setTerr_attitude(-1);
	state.compute_state(measurements, alerts, 1);
	assertEquals(true,alerts.isPWR60());
	assertEquals(false,alerts.isPOS());
	assertEquals(false,alerts.isPDMG());
	assertEquals(true,alerts.isPackage_not_delivered());
	assertEquals(true,alerts.isDC());
	assertEquals(true,alerts.isESR());
	assertEquals(false,alerts.isISRZ());
	assertEquals(false,alerts.isPD());
	assertEquals(0.0,measurements.getAltitude(),0.01);
	assertEquals(0.075,measurements.getVf(),0.0001);
	assertEquals(-0.005,measurements.getVd(),0.0001);
	assertEquals("Off",measurements.getMotor_state());
	assertEquals(155,measurements.getpower_remaining(),.1);
	assertEquals("D",measurements.getshield_position());
	assertEquals("R",measurements.getshield_cmd());
}

}
