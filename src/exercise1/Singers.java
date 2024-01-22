package src.exercise1;

public class Singers {
    private int _singerId;
    private String _singerName;
    private String _singerAddress;
    private String _dateOfBirth;
    private int _numOfAlbumsPublished;

    public Singers() {
    }

    public Singers(int singerId, String singerName, String singerAddress, String dateOfBirth,
            int numOfAlbumsPublished) {
        _singerId = singerId;
        _singerName = singerName;
        _singerAddress = singerAddress;
        _dateOfBirth = dateOfBirth;
        _numOfAlbumsPublished = numOfAlbumsPublished;
    }

    public int getSingerId() {
        return _singerId;
    }

    public void setSingerId(int singerId) {
        _singerId = singerId;
    }

    public String getSingerName() {
        return _singerName;
    }

    public void setSingerName(String singerName) {
        _singerName = singerName;
    }

    public String getSingerAddress() {
        return _singerAddress;
    }

    public void setSingerAddress(String singerAddress) {
        _singerAddress = singerAddress;
    }

    public String getDateOfBirth() {
        return _dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        _dateOfBirth = dateOfBirth;
    }

    public int getNumOfAlbumsPublished() {
        return _numOfAlbumsPublished;
    }

    public void setNumOfAlbumsPublished(int numOfAlbumsPublished) {
        _numOfAlbumsPublished = numOfAlbumsPublished;
    }

    public void setAllValues(int singerId, String singerName, String singerAddress, String dateOfBirth,
            int numOfAlbumsPublished) {
        _singerId = singerId;
        _singerName = singerName;
        _singerAddress = singerAddress;
        _dateOfBirth = dateOfBirth;
        _numOfAlbumsPublished = numOfAlbumsPublished;
    }
}
