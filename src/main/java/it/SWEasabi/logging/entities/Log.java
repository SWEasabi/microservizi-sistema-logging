package it.SWEasabi.logging.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Log
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="idmisuratore")
    private long idMisuratore;
    private long timestamp;
    private int valore;
    private String tipo;
    
    public Log() {
    	this.id=0;
    	this.idMisuratore=0;
    	this.timestamp=0;
    	this.valore=0;
    	this.tipo="";
    }

    public Log(int idMisuratore, long timestamp, int valore, String tipo)
    {
        this.idMisuratore = idMisuratore;
        this.timestamp = timestamp;
        this.valore = valore;
        this.tipo = tipo;
    }
    
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdMisuratore()
    {
        return idMisuratore;
    }
    public long getTimeStamp()
    {
        return timestamp;
    }
    public int getValore()
    {
        return valore;
    }
	public void setIdMisuratore(long idMisuratore) {
		this.idMisuratore = idMisuratore;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public void setValore(int valore) {
		this.valore = valore;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public long getTimestamp() {
		return timestamp;
	}
	
}
