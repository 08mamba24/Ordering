package cn.edu.njust.main.model;

public class Setting {
    private Integer id;

    private Integer tableNumber;

    private Integer todayLatestReserveTime;

    private Integer reserveSpan;

    private Integer personPerTable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Integer getTodayLatestReserveTime() {
        return todayLatestReserveTime;
    }

    public void setTodayLatestReserveTime(Integer todayLatestReserveTime) {
        this.todayLatestReserveTime = todayLatestReserveTime;
    }

    public Integer getReserveSpan() {
        return reserveSpan;
    }

    public void setReserveSpan(Integer reserveSpan) {
        this.reserveSpan = reserveSpan;
    }

    public Integer getPersonPerTable() {
        return personPerTable;
    }

    public void setPersonPerTable(Integer personPerTable) {
        this.personPerTable = personPerTable;
    }
}