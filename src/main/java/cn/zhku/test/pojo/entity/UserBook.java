package cn.zhku.test.pojo.entity;

import java.io.Serializable;
import java.util.Date;

public class UserBook implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book.id
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book.user_id
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book.book_id
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    private String bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book.date
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book.operate
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    private String operate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_book
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book.id
     *
     * @return the value of user_book.id
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book.id
     *
     * @param id the value for user_book.id
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book.user_id
     *
     * @return the value of user_book.user_id
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book.user_id
     *
     * @param userId the value for user_book.user_id
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book.book_id
     *
     * @return the value of user_book.book_id
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book.book_id
     *
     * @param bookId the value for user_book.book_id
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book.date
     *
     * @return the value of user_book.date
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book.date
     *
     * @param date the value for user_book.date
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book.operate
     *
     * @return the value of user_book.operate
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    public String getOperate() {
        return operate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book.operate
     *
     * @param operate the value for user_book.operate
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    public void setOperate(String operate) {
        this.operate = operate == null ? null : operate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_book
     *
     * @mbggenerated Thu Mar 22 22:58:46 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", bookId=").append(bookId);
        sb.append(", date=").append(date);
        sb.append(", operate=").append(operate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}