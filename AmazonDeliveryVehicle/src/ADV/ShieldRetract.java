package ADV;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShieldRetract {
	
	@Test
	public void test_case7a() {
		
		Measurements m1 = new Measurements();
		Alerts a1 = new Alerts();
		ComputeSimulationState sim_state = new ComputeSimulationState();
		int t = 0;
		ADVDisplay display = new ADVDisplay(m1,a1);
        display.setVisible(false);
        
        m1.setVd(-0.005);
        m1.setVf(+0.075);
        m1.setAltitude(+0.0);
        m1.setpower_remaining(155);
		a1.setRand_value(-0.1);
		a1.setshield_damage_count(10);
		a1.setEsr_persistence_count(0);
		a1.setESR_latch(false);
		m1.setCum_attitude(+5);
		m1.setTerr_attitude(-1);
		m1.setshield_position("R");
		m1.setshield_cmd(m1.getshield_position());
		m1.setAttitude_cmd("0");
		m1.setMotor_state("Off");
       
		while (!a1.isPD() & !a1.isDC())
        {	
    		sim_state.compute_state(m1, a1, t);
    		display.updateDisplay(m1, a1);
    		t++;
            try 
            {
                Thread.sleep(2500);	//2500 milliseconds is one second.
                break;
            } catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
     }

	@Test
	public void test_case9() {
		
		Measurements m1 = new Measurements();
		Alerts a1 = new Alerts();
		ComputeSimulationState sim_state = new ComputeSimulationState();
		int t = 0;
		ADVDisplay display = new ADVDisplay(m1,a1);
        display.setVisible(false);
        
        m1.setVd(-0.005);
        m1.setVf(+0.075);
        m1.setAltitude(+0.0);
        m1.setpower_remaining(155);
		a1.setRand_value(-0.1);
		a1.setshield_damage_count(0);
		a1.setEsr_persistence_count(0);
		a1.setESR_latch(false);
		m1.setCum_attitude(+6);
		m1.setTerr_attitude(-1);
		m1.setshield_position("R");
		m1.setshield_cmd(m1.getshield_position());
		m1.setAttitude_cmd("0"); 
		m1.setMotor_state("Off");
       
		while (!a1.isPD() & !a1.isDC())
        {	
    		sim_state.compute_state(m1, a1, t);
    		display.updateDisplay(m1, a1);
    		t++;
            try 
            {
                Thread.sleep(2500);	//2500 milliseconds is one second.
                break;
            } catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
     }
}
