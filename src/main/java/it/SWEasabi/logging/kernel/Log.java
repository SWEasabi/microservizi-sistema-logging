package it.SWEasabi.logging.kernel;

public class Log
{
    private int idMisuratore;
    private long timestamp;
    private int valore;

    public Log(int _idMisuratore, long _timestamp, int _valore)
    {
        idMisuratore = _idMisuratore;
        timestamp = _timestamp;
        valore = _valore;
    }
    public int getIdMisuratore()
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
}
