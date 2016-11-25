/**
 * This class is generated by jOOQ
 */
package cn.leapcloud.release.platform.dao.entity;


import cn.leapcloud.release.platform.dao.entity.tables.ReleaseTask;
import cn.leapcloud.release.platform.dao.entity.tables.ReleaseType;
import cn.leapcloud.release.platform.dao.entity.tables.User;
import cn.leapcloud.release.platform.dao.entity.tables.records.ReleaseTaskRecord;
import cn.leapcloud.release.platform.dao.entity.tables.records.ReleaseTypeRecord;
import cn.leapcloud.release.platform.dao.entity.tables.records.UserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>leapcloud_release_platform</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<ReleaseTaskRecord, Integer> IDENTITY_RELEASE_TASK = Identities0.IDENTITY_RELEASE_TASK;
	public static final Identity<ReleaseTypeRecord, Integer> IDENTITY_RELEASE_TYPE = Identities0.IDENTITY_RELEASE_TYPE;
	public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<ReleaseTaskRecord> KEY_RELEASE_TASK_PRIMARY = UniqueKeys0.KEY_RELEASE_TASK_PRIMARY;
	public static final UniqueKey<ReleaseTypeRecord> KEY_RELEASE_TYPE_PRIMARY = UniqueKeys0.KEY_RELEASE_TYPE_PRIMARY;
	public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<ReleaseTaskRecord, Integer> IDENTITY_RELEASE_TASK = createIdentity(ReleaseTask.RELEASE_TASK, ReleaseTask.RELEASE_TASK.ID);
		public static Identity<ReleaseTypeRecord, Integer> IDENTITY_RELEASE_TYPE = createIdentity(ReleaseType.RELEASE_TYPE, ReleaseType.RELEASE_TYPE.ID);
		public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<ReleaseTaskRecord> KEY_RELEASE_TASK_PRIMARY = createUniqueKey(ReleaseTask.RELEASE_TASK, ReleaseTask.RELEASE_TASK.ID);
		public static final UniqueKey<ReleaseTypeRecord> KEY_RELEASE_TYPE_PRIMARY = createUniqueKey(ReleaseType.RELEASE_TYPE, ReleaseType.RELEASE_TYPE.ID);
		public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, User.USER.ID);
	}
}