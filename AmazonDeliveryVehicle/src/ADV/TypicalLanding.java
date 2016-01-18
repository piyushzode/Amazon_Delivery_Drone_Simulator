package ADV;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class TypicalLanding {

	public void setSHDCMDPanel_Green(ADVDisplay display) {
		display.SHDCMDPanel.setBackground(Color.GREEN);
	}


	@Test
	public void test_case1a() {

		Measurements m1 = new Measurements();
		Alerts a1 = new Alerts();
		ComputeSimulationState sim_state = new ComputeSimulationState();
		int t = 0;
		ADVDisplay display = new ADVDisplay(m1,a1);
        display.setVisible(false);	
        
        m1.setVd(-6.667);
        m1.setVf(+100.005);
        m1.setAltitude(+249.9);
        m1.setpower_remaining(180);
		a1.setRand_value(-0.1);
		a1.setshield_damage_count(0);
		a1.setEsr_persistence_count(0);
		a1.setESR_latch(false);
		m1.setCum_attitude(+5);
		m1.setTerr_attitude(-1);
		m1.setshield_position("R");
		m1.setshield_cmd(m1.getshield_position());
		m1.setAttitude_cmd("0");
		m1.setMotor_state("MP1");
		

		while (!a1.isPD() & !a1.isDC())
        {	
    		sim_state.compute_state(m1, a1, t);
    		display.updateDisplay(m1, a1);
    		t++;
            try 
            {
                Thread.sleep(2500);	//1000 milliseconds is one second.
                break;
            } catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }  
	}
	
	@Test
	public void test_case2a() {
		
		Measurements m1 = new Measurements();
		Alerts a1 = new Alerts();
		ComputeSimulationState sim_state = new ComputeSimulationState();
		int t = 0;
		ADVDisplay display = new ADVDisplay(m1,a1);
        display.setVisible(false);
        
        m1.setVd(-6.666);
        m1.setVf(+99.990);
        m1.setAltitude(+249.9);
        m1.setpower_remaining(180);
		a1.setRand_value(-0.1);
		a1.setshield_damage_count(0);
		a1.setEsr_persistence_count(0);
		a1.setESR_latch(false);
		m1.setCum_attitude(+5);
		m1.setTerr_attitude(-1);
		m1.setshield_position("R");
		m1.setshield_cmd(m1.getshield_position());
		m1.setAttitude_cmd("0");
		m1.setMotor_state("MP1");
       
		while (!a1.isPD() & !a1.isDC())
        {	
    		sim_state.compute_state(m1, a1, t);
    		display.updateDisplay(m1, a1);
    		t++;
            try 
            {
                Thread.sleep(10000);	//1000 milliseconds is one second.
                break;
            } catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
	}
	
	@Test
	public void test_case3a() {
		
		Measurements m1 = new Measurements();
		Alerts a1 = new Alerts();
		ComputeSimulationState sim_state = new ComputeSimulationState();
		int t = 0;
		ADVDisplay display = new ADVDisplay(m1,a1);
        display.setVisible(false);
        
        m1.setVd(-6.666);
        m1.setVf(+99.990);
        m1.setAltitude(+49.9);
        m1.setpower_remaining(180);
		a1.setRand_value(-0.1);
		a1.setshield_damage_count(0);
		a1.setEsr_persistence_count(0);
		a1.setESR_latch(false);
		m1.setCum_attitude(+5);
		m1.setTerr_attitude(-1);
		m1.setshield_position("R");
		m1.setshield_cmd(m1.getshield_position());
		m1.setAttitude_cmd("0");
		m1.setMotor_state("MP2");
       
		while (!a1.isPD() & !a1.isDC())
        {	
    		sim_state.compute_state(m1, a1, t);
    		display.updateDisplay(m1, a1);
    		t++;
            try 
            {
                Thread.sleep(10000);	//1000 milliseconds is one second.
                break;
            } catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
    }
	
	@Test
	public void test_case4a() {
		
		Measurements m1 = new Measurements();
		Alerts a1 = new Alerts();
		ComputeSimulationState sim_state = new ComputeSimulationState();
		int t = 0;
		ADVDisplay display = new ADVDisplay(m1,a1);
        display.setVisible(false);
        
        m1.setVd(-1.667);
        m1.setVf(+25.005);
        m1.setAltitude(0.1);
        m1.setpower_remaining(179);
		a1.setRand_value(-0.1);
		a1.setshield_damage_count(0);
		a1.setEsr_persistence_count(0);
		a1.setESR_latch(false);
		m1.setCum_attitude(+5);
		m1.setTerr_attitude(-1);
		m1.setshield_position("D");
		m1.setshield_cmd(m1.getshield_position());
		m1.setAttitude_cmd("0");
		m1.setMotor_state("MP2");
       
		while (!a1.isPD() & !a1.isDC())
        {	
    		sim_state.compute_state(m1, a1, t);
    		display.updateDisplay(m1, a1);
    		t++;
            try 
            {
                Thread.sleep(10000);	//1000 milliseconds is one second.
                break;
            } catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
     }
	
	@Test
	public void test_case5a() {
		
		Measurements m1 = new Measurements();
		Alerts a1 = new Alerts();
		ComputeSimulationState sim_state = new ComputeSimulationState();
		int t = 0;
		ADVDisplay display = new ADVDisplay(m1,a1);
        display.setVisible(false);
        
        m1.setVd(-1.666);
        m1.setVf(+24.990);
        m1.setAltitude(+23.8);
        m1.setpower_remaining(172);
		a1.setRand_value(-0.1);
		a1.setshield_damage_count(0);
		a1.setEsr_persistence_count(0);
		a1.setESR_latch(false);
		m1.setCum_attitude(+5);
		m1.setTerr_attitude(-1);
		m1.setshield_position("D");
		m1.setshield_cmd(m1.getshield_position());
		m1.setAttitude_cmd("0");
		m1.setMotor_state("MP2");
       
		while (!a1.isPD() & !a1.isDC())
        {	
    		sim_state.compute_state(m1, a1, t);
    		display.updateDisplay(m1, a1);
    		t++;
            try 
            {
                Thread.sleep(10000);	//1000 milliseconds is one second.
                break;
            } catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
     }
	
	@Test
	public void test_case6a() {
	
		Measurements m1 = new Measurements();
		Alerts a1 = new Alerts();
		ComputeSimulationState sim_state = new ComputeSimulationState();
		int t = 0;
		ADVDisplay display = new ADVDisplay(m1,a1);
        display.setVisible(false);
        
        m1.setVd(-0.999);
        m1.setVf(+14.985);
        m1.setAltitude(+14.0);
        m1.setpower_remaining(165);
		a1.setRand_value(-0.1);
		a1.setshield_damage_count(0);
		a1.setEsr_persistence_count(0);
		a1.setESR_latch(true);
		m1.setCum_attitude(+5);
		m1.setTerr_attitude(-1);
		m1.setshield_position("D");
		m1.setshield_cmd(m1.getshield_position());
		m1.setAttitude_cmd("0");
		m1.setMotor_state("MP2");
		
		while (!a1.isPD() & !a1.isDC())
        {	
    		sim_state.compute_state(m1, a1, t);
    		display.updateDisplay(m1, a1);
    		setSHDCMDPanel_Green(display);
    		t++;
            try 
            {
                Thread.sleep(10000);	//1000 milliseconds is one second.
                break;
            } catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
     }
	
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
                Thread.sleep(10000);	//1000 milliseconds is one second.
                break;
            } catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
     }

}
