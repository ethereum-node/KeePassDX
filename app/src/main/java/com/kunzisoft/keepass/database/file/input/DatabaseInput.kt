/*
 * Copyright 2019 Jeremy Jamet / Kunzisoft.
 *     
 * This file is part of KeePass DX.
 *
 *  KeePass DX is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  KeePass DX is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with KeePass DX.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.kunzisoft.keepass.database.file.input

import com.kunzisoft.keepass.database.element.database.DatabaseVersioned
import com.kunzisoft.keepass.database.exception.LoadDatabaseException
import com.kunzisoft.keepass.tasks.ProgressTaskUpdater
import java.io.InputStream

abstract class DatabaseInput<PwDb : DatabaseVersioned<*, *, *, *>> {

    /**
     * Load a versioned database file, return contents in a new DatabaseVersioned.
     *
     * @param databaseInputStream  Existing file to load.
     * @param password Pass phrase for infile.
     * @return new DatabaseVersioned container.
     *
     * @throws LoadDatabaseException on database error (contains IO exceptions)
     */
    @Throws(LoadDatabaseException::class)
    abstract fun openDatabase(databaseInputStream: InputStream,
                              password: String?,
                              keyInputStream: InputStream?,
                              progressTaskUpdater: ProgressTaskUpdater?): PwDb

}
