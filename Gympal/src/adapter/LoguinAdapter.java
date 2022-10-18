package adapter;

import java.util.HashMap;
import java.util.Map;

import models.Socio;
import models.Interfaces.adapters.IAdapterAutenticator;

public class LoguinAdapter implements IAdapterAutenticator {

	private final

	Map<String, String> usuarios = new HashMap<String, String>();
	Map<String, String> contraseņa = new HashMap<String, String>();

	public LoguinAdapter() {
		usuarios.put("Socio1", "User1");
		usuarios.put("Socio2", "User2");
		usuarios.put("Socio3", "User3");

		contraseņa.put("User1", "Passwd1");
		contraseņa.put("User2", "Passwd2");
		contraseņa.put("User3", "Passwd3");

	}

	@Override
	public boolean login(Socio socio, String user, String passwd) {
		for (Map.Entry<String, String> entry : usuarios.entrySet()) {

			if (entry.getKey().equals(socio.getNroSocio())) {

				if (user.equals(entry.getValue())) {
					if (contraseņa.get(user).equals(passwd))
						return true;
				}

			}

		}

		return false;
	}

}
