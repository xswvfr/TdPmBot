package io.github.nekohasekai.pm

import io.github.nekohasekai.nekolib.i18n.L

private val L.pm by L.receiveLocaleSet("pm")
private val string = L.receiveLocaleString { pm }

internal val L.HELP_MSG by string
internal val L.PRIVATE_INSTANCE by string

internal val L.CREATE_BOT_DEF by string
internal val L.INPUT_BOT_TOKEN by string
internal val L.INVALID_BOT_TOKEN by string
internal val L.FETCHING_INFO by string
internal val L.CREATING_BOT by string
internal val L.ALREADY_EXISTS by string
internal val L.FINISH_CREATION by string
internal val L.CREATE_FINISHED by string

internal val L.EDIT_BOTS_DEF by string
internal val L.SELECT_TO_EDIT by string

internal val L.DELETE_BOT_DEF by string
internal val L.NO_BOTS by string
internal val L.SELECT_TO_DELETE by string
internal val L.BOT_SELECTED by string
internal val L.INVALID_SELECTED by string
internal val L.DELETE_CONFIRM by string
internal val L.DELETE_CONFIRM_REGEX by string
internal val L.CONFIRM_NOT_MATCH by string
internal val L.STOPPING by string
internal val L.DELETING by string
internal val L.BOT_DELETED by string
internal val L.BOT_AUTH_FAILED by string
internal val L.BOT_LOGOUT by string

internal val L.SET_STARTS_DEF by string
internal val L.SELECT_TO_SET by string
internal val L.JUMP_TO_SET by string
internal val L.SET_MESSAGES_STATUS by string
internal val L.SETTING_UNDEF by string
internal val L.EMPTY by string
internal val L.MESSAGES_STATUS_COUNT by string
internal val L.INPUT_MESSAGES by string
internal val L.MESSAGE_ADDED by string
internal val L.MESSAGE_ADDED_FWD by string
internal val L.MESSAGES_RESET by string
internal val L.ERROR_IN_PREVIEW by string

internal val L.SET_INTEGRATION_DEF by string
internal val L.SET_INTEGRATION by string
internal val L.INTEGRATION_HAS_SET by string
internal val L.INTEGRATION_STATUS by string
internal val L.INTEGRATION_UNDEF by string
internal val L.INTEGRATION_OK by string
internal val L.INTEGRATION_PAUSED by string
internal val L.INTEGRATION_PAUSED_NOTICE by string
internal val L.INTEGRATION_UNABLE_TO_RESUME by string
internal val L.INTEGRATION_SET by string
internal val L.INTEGRATION_PAUSE by string
internal val L.INTEGRATION_RESUME by string
internal val L.INTEGRATION_DEL by string
internal val L.INTEGRATION_ENABLE_ADMIN_ONLY by string
internal val L.INTEGRATION_DISABLE_ADMIN_ONLY by string
internal val L.INTEGRATION_ENABLE_CLEAN_MODE by string
internal val L.INTEGRATION_DISABLE_CLEAN_MODE by string

internal val L.INPUT_NOTICE by string
internal val L.USER_NOT_FOUND by string
internal val L.JOINED_NOTICE by string
internal val L.EXITED by string
internal val L.NOTHING_TO_EXIT by string
internal val L.SENT by string
internal val L.REPLIED by string
internal val L.EDITED by string
internal val L.DELETED by string
internal val L.RECORD_NF by string
internal val L.REPLIED_NF by string
internal val L.MESSAGE_DELETED by string
internal val L.MESSAGE_EDITED by string
internal val L.DEFAULT_WELCOME by string
internal val L.POWERED_BY by string

internal val L.BLOCKED by string
internal val L.BLOCK_EXISTS by string
internal val L.BLOCK_NOT_EXISTS by string
internal val L.UNBLOCKED by string
internal val L.CANNOT_BLOCK_SELF by string

internal val L.PM_HELP by string