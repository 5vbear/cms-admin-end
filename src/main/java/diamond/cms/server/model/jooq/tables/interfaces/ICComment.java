/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ICComment extends Serializable {

	/**
	 * Setter for <code>cms.c_comment.id</code>.
	 */
	public void setId(String value);

	/**
	 * Getter for <code>cms.c_comment.id</code>.
	 */
	@NotNull
	@Size(max = 40)
	public String getId();

	/**
	 * Setter for <code>cms.c_comment.article_id</code>.
	 */
	public void setArticleId(String value);

	/**
	 * Getter for <code>cms.c_comment.article_id</code>.
	 */
	@NotNull
	@Size(max = 40)
	public String getArticleId();

	/**
	 * Setter for <code>cms.c_comment.nickname</code>.
	 */
	public void setNickname(String value);

	/**
	 * Getter for <code>cms.c_comment.nickname</code>.
	 */
	@NotNull
	@Size(max = 45)
	public String getNickname();

	/**
	 * Setter for <code>cms.c_comment.email</code>.
	 */
	public void setEmail(String value);

	/**
	 * Getter for <code>cms.c_comment.email</code>.
	 */
	@NotNull
	@Size(max = 45)
	public String getEmail();

	/**
	 * Setter for <code>cms.c_comment.content</code>.
	 */
	public void setContent(String value);

	/**
	 * Getter for <code>cms.c_comment.content</code>.
	 */
	@Size(max = 500)
	public String getContent();

	/**
	 * Setter for <code>cms.c_comment.state</code>. 0: 删除
1: 正常

	 */
	public void setState(Integer value);

	/**
	 * Getter for <code>cms.c_comment.state</code>. 0: 删除
1: 正常

	 */
	@NotNull
	public Integer getState();

	/**
	 * Setter for <code>cms.c_comment.create_time</code>.
	 */
	public void setCreateTime(Timestamp value);

	/**
	 * Getter for <code>cms.c_comment.create_time</code>.
	 */
	@NotNull
	public Timestamp getCreateTime();

	/**
	 * Setter for <code>cms.c_comment.update_time</code>.
	 */
	public void setUpdateTime(Timestamp value);

	/**
	 * Getter for <code>cms.c_comment.update_time</code>.
	 */
	@NotNull
	public Timestamp getUpdateTime();

	/**
	 * Setter for <code>cms.c_comment.ip</code>.
	 */
	public void setIp(String value);

	/**
	 * Getter for <code>cms.c_comment.ip</code>.
	 */
	@NotNull
	@Size(max = 40)
	public String getIp();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ICComment
	 */
	public void from(diamond.cms.server.model.jooq.tables.interfaces.ICComment from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ICComment
	 */
	public <E extends diamond.cms.server.model.jooq.tables.interfaces.ICComment> E into(E into);
}
